## Overview

This repository contains a proof of concept (POC) application for an Inventory Management System developed with Java 21. It demonstrates the usage of new Java 21 features while providing a practical application for tracking products and their quantities.

## Features

- **Record Class**: Utilizes the `record` feature to define an immutable `Product` class.
- **Pattern Matching for Switch**: Categorizes products based on their type using pattern matching.
- **Virtual Threads**: Implements virtual threads for handling concurrent requests, allowing multiple users to interact with the inventory simultaneously.
- **Enhanced String Methods**: Uses new `String` methods for better string manipulation.
- **Sealed Classes**: Implements sealed classes for different product categories (e.g., `Electronics`, `Groceries`).

## Getting Started

To run the application, ensure you have Java 21 installed. Follow these steps:

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-directory>