---
layout: full.html.hbs
algolia: true
title: decrby
---

# decrby

{{{since "1.0.0"}}}

Decrement the number stored at `key` by a provided integer value. If the key does not exist, it is set to 0 before performing the operation.

[[_Redis documentation_]](https://redis.io/commands/decrby)

---

## Query Syntax

### HTTP

```http
URL: http://kuzzle:7512/ms/_decrby/<_id>
Method: POST  
Body:  
```

```js
{
  "value": <decrement value>
}
```

### Other protocols

```js
{
  "controller": "ms",
  "action": "decrby",
  "_id": "<key>",
  "body": {
    "value": <decrement value>
  }
}
```

---

## Arguments

* `_id`: key to decrement

---

## Body properties

* `value`: the decrement value

---

## Response

Updated key value.

```javascript
{
  "requestId": "<unique request identifier>",
  "status": 200,
  "error": null,
  "controller": "ms",
  "action": "decrby",
  "collection": null,
  "index": null,
  "result": 1337
}
```