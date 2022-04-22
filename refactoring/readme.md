# Long Method

> Methods that is longer than ten lines should make you start asking questions

## Treatment

If you feel the need to commment on something inside a method, you should take this code and put a new method

## Recipe #1
### Extract Method

❌
```java 
void printOwing() {
  printBanner();

  // Print details.
  System.out.println("name: " + name);
  System.out.println("amount: " + getOutstanding());
}
````
✅ 
```java 
void printOwing() {
  printBanner();
  printDetails(getOutstanding())
}

void printDetails(double outstanding) {
  System.out.println("name: " + name);
  System.out.println("amount: " + outstanding); 
}
````

## Recipe #2
### Reduce Local Variables and Parameters Before Extracting a Method
If local variables and parameters interfere with extracting a method, use: **Replace Temp with Query**, **Introduce Parameter Object** or **Preserver whole Object**.

### **Replace Temp with Query**

## Problem 🤯
```java 
double calculateTotal() {
  double basePrice = quantity * itemPrice;
  if (basePrice > 1000) {
    return basePrice * 0.95;
  }
  else {
    return basePrice * 0.98;
  }
}
```
## Solution ✅
```java
double calculateTotal() {
  if (basePrice() > 1000) {
    return basePrice() * 0.95
  }
  else {
    return basePrice() * 0.98
  }
}

doube basePrice() {
  return quantity * intemPrice
}

```

### **Introduce Parameter Object**

![alt](https://i.ibb.co/sw0kty7/image.png)

### **Preserver Whole Object**
![alt](https://i.ibb.co/xgGr9Ky/image.png)

## Recipe #3

### **Replace Method with Method Object**

If none of the previours recippe works, try moving entire method to a separate object.

## Problem 🤯
```java 
class Order {
  // ...
  public double price() {
    double primaryBasePrice;
    double secondaryBasePrice;
    double tertiaryBasePrice;
    // Perform long computation.
  }
}
```

## Solution ✅
```java
class Order {
  public double price() {
    return new PriceCalculator(this).compute();
  }
}

class PriceCalculator {
  private double primaryBasePrice;
  private double secondaryBasePrice;
  private double primaryBasePrice;
  private double tertiaryBasePrice;

  public PriceCalculator(Order order) {
    //Copy relevant information from the order object
  }

  public double compute() {
    // Perform long computation
  }
}
```
## Recipe #3

### **Conditionals and Loop**

Conditional operators and loops are a good clue that code can be moved to a separate method.
For conditionals, use **Decompose Conditional**. If loops are in the way, try **Extract Method**.

### **Decompose Conditional**

## Problem 🤯
```java
// "Complex" contidional ( date.before(SUMMER_START) || date.after(SUMMER_END )
if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
  charge = quantity * winterRate + winterServiceCharge;
}
else {
  charge = quantity * summerRate;
}
```

## Solution ✅
```java
if (isSummer(date)) {
  charge = summerCharge(quantity);
}
else {
  charge = winterCharge(quantity);
}
```

### **Extract Method**
## Problem 🤯
```java
void printProperties(List users) {
  for (int i = 0; i < users.size(); i++) {
    String result = "";
    result += users.get(i).getName();
    result += " ";
    result += users.get(i).getAge();
    System.out.println(result);

    // ...
  }
}
```
## Solution ✅
```java
void printProperties(List users) {
  for (User user: users) {
    System.out.println(getProperties(user));  
  }
  //..
}

String getProperties (User user) {
  return user.getName() + " " + user.getAge();
}
```
