<template>
  <div class="alert alert-warning" id="deprecatedBanner">
    <p>
      This SDK has been deprecated because of stability issues. It is not
      advised to use it in a production environment.
    </p>
  </div>
</template>

<script>
export default {
  name: 'DeprecatedBanner'
};
</script>

<style>
#deprecatedBanner {
  font-size: 18px;
  vertical-align: middle;
}
</style>
