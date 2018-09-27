kuzzle.index
  .mDelete(['nyc-open-data', 'mtp-open-data'])
  .then(response => {
    console.log(`Successfully deleted ${response.deleted.length} indexes`);
  })
  .catch(error => {
    console.error(error.message);
  });