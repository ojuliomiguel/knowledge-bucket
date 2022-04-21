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
❌
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
✅
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