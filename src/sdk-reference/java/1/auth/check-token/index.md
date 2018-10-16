---
layout: sdk.html.hbs
algolia: true
title: checkToken
description: Checks a JWT Token's validity.
order: 200
---

# checkToken

Checks a JWT Token's validity.

## Signature

```java
TokenValidity checkToken(String);
```

## Arguments

| Arguments    | Type    | Description
|--------------|---------|-------------
| ``token`` | String | the token

## Return

A TokenValidity object which has:

| Name                | Type    | Description
| ------------------- | ------- | -----------------------------------
| valid               | boolean | Tell if the token is valid or not
| state               | String  | Explain why the token is invalid
| expires_at          | BigInteger     | Tells when the token expires

## Exceptions

Throws a `KuzzleException` if there is an error. See how to [handle error]({{ site_base_path }}sdk-reference/essentials/error-handling).

## Usage

[snippet=check-token]