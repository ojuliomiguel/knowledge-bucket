# Long Method

> Methods that is longer than ten lines should make you start asking questions

## Treatment

If you feel the need to commment on something inside a method, you should take this code and put a new method

## Recipe 1
### Extract Method

```java
void printOwing() {
  printBanner();

  // Print details.
  System.out.println("name: " + name);
  System.out.println("amount: " + getOutstanding());
}
````

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