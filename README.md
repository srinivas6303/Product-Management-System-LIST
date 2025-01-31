# Product Management System - List
This is a **Java-based Product Management System** that allows you to manage a list of products. You can add, retrieve, delete, and filter products based on various criteria such as name, place, warranty, and more. 
The system is designed to be simple and easy to use.

---

## Features

The system provides the following **8 methods** to manage products:

1. **Add Product**  
   Adds a new product to the list.  
   - Method: `addProduct(Product product)`

2. **Get All Products**  
   Retrieves and displays all products in the list.  
   - Method: `getAllProducts()`

3. **Get Product by Name**  
   Searches for a product by its name and displays it.  
   - Method: `getProductByName(String name)`

4. **Get Products by Place**  
   Filters and displays products based on their place (location).  
   - Method: `getProductByPlace(String place)`

5. **Delete Product by Name**  
   Deletes a product from the list by its name.  
   - Method: `deleteProductByName(String name)`

6. **Delete All Products**  
   Clears the entire list of products.  
   - Method: `deleteAllProducts()`

7. **Out of Warranty Products**  
   Filters and displays products that are out of warranty based on the given year.  
   - Method: `outOfWarrenty(int year)`

8. **Find Products by Substring**  
   Searches for products whose name, type, place, or warranty contains the given substring.  
   - Method: `findBySubString(String text)`

---

## Code Structure
The project consists of the following classes:<br>

**Product.java**
Represents a product with attributes: name, type, place, and warranty.<br>
Includes constructors, getters, setters, and a toString() method.<br>

**ProductServices.java**
Contains the logic for managing the list of products.<br>
Implements all 8 methods for adding, retrieving, deleting, and filtering products.<br>

**Main.java**
Demonstrates the usage of the ProductServices class.<br>
Adds sample products and calls various methods to showcase functionality.<br>


## How to Use
1. **Clone the Repository**  
   Clone this repository to your local machine using the following command:  
   ```bash
   git clone https://github.com/your-username/product-management-system.git

![Screenshot 2025-01-31 173140](https://github.com/user-attachments/assets/ac6e57a4-d501-4da8-80af-16b68b740154)
![Screenshot 2025-01-31 173118](https://github.com/user-attachments/assets/9493c343-1eb6-49ca-a142-3bd4774ed521)
![Screenshot 2025-01-31 173208](https://github.com/user-attachments/assets/f9fc4a78-bd33-44f5-8944-c0ed494fb0a0)

   
