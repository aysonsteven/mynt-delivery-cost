# Parcel Delivery Cost Calculation API

This Spring Boot application provides an API for calculating the cost of parcel delivery based on weight, height, width, length, and optionally, a voucher code for discounts.

## Features

- Calculate the cost of parcel delivery based on weight and volume.
- Apply discounts using voucher codes.
- Flexible and configurable cost calculation rules.
- Clean and maintainable codebase.

## Endpoints

### ParcelController /api/parcel
### 1. Calculate Initial Cost

**Endpoint**: POST /cost

**Description**: Calculate the initial cost of parcel delivery.

**Request Body**:
```json
{
  "weight": 5,
  "height": 10,
  "width": 20,
  "length": 30
}
```

### VoucherController /api/voucher
### 1. Verify Voucher

**Endpoint**: GET /verify/{code}

**Description**: Verify a voucher code and retrieve voucher details.

**Request**:
- Path Variable: `code` - Voucher code to verify.

**Response**:
```json
{
    "voucherItem": {
        "code": "2",
        "discount": 10.0,
        "expiry": "2024-05-02T10:21:31.045Z"
    },
    "status": null,
    "isExpired": true
}
```

### 2. Apply Voucher

**Endpoint**: POST /apply

**Description**: Apply a voucher code to get a discount on the delivery cost.

**Request Body**:
```json
{
  "voucherCode": "VOUCHER123",
  "parcelRequest": {
    "weight": 5,
    "height": 10,
    "width": 20,
    "length": 30
  }
}
```

***Note***:
I tried using the Voucher Mock API provided. Unfortunately it does not work and it's not returning any response.
With that i used another mock API using mockapi.io. But I still followed the model based on the swagger.

***MockAPI***: https://6634a4899bb0df2359a2332e.mockapi.io/mock-api/v1/voucher


