# Parcel Delivery Cost Calculation API

This Spring Boot application provides an API for calculating the cost of parcel delivery based on weight, height, width, length, and optionally, a voucher code for discounts.

## Features

- Calculate the cost of parcel delivery based on weight and volume.
- Apply discounts using voucher codes.
- Flexible and configurable cost calculation rules.
- Clean and maintainable codebase.

## Endpoints

### 1. Calculate Initial Cost

**Endpoint**: POST /calculateCost

**Description**: Calculate the initial cost of parcel delivery.

**Request Body**:
```json
{
  "weight": 5,
  "height": 10,
  "width": 20,
  "length": 30
}

### 1. Verify Voucher

**Endpoint**: GET /verify/{code}

**Description**: Verify a voucher code and retrieve voucher details.

**Request**:
- Path Variable: `code` - Voucher code to verify.

**Response**:
```json
{
  "code": "VOUCHER123",
  "discount": 0.1,
  "description": "10% off on your next purchase"
}