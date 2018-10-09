---
layout: full.html.hbs
algolia: true
title: create
---

# create

{{{since "1.0.0"}}}

Create a new document in the persistent data storage.

Return an error if the document already exists.

---

## Query Syntax

### HTTP

```http
URL: http://kuzzle:7512/<index>/<collection>/_create[?refresh=wait_for]
URL(2): http://kuzzle:7512/<index>/<collection>/<documentId>/_create[?refresh=wait_for]
Method: POST  
Body:
```

```js
{
  // document content
}
```

### Other protocols

```js
{
  "index": "<index>",
  "collection": "<collection>",
  "controller": "document",
  "action": "create",
  "_id": "<documentId>",            
  "body": {
    // document content
  }
}
```

---

## Arguments

* `collection`: data collection
* `index`: data index

### Optional:

* `documentId`: set the document unique ID to the provided value, instead of auto-generating a random ID
* `refresh`: if set to `wait_for`, Kuzzle will not respond until the newly created document is indexed

---

## Body properties

Document content to create.

---

## Response

Return an object with the following properties:

* `_id`: created document unique identifier
* `_source`: document content
* `_version`: version of the created document (should be `1`)

```javascript
{
  "status": 200,
  "error": null,
  "index": "<index>",
  "collection": "<collection>",
  "controller": "document",
  "action": "create",
  "requestId": "<unique request identifier>",
  "result": {
    "_id": "<documentId>",
    "_version": 1,
    "_source": {
      // ...
    },
  }
}
```