# Clojure Practice Exercises

> Exercises derived from the concepts explored in this codebase.  
> Each exercise is self-contained — open the REPL and start hacking!

---

## To study

1. Foundations: 1, 2, 3
2. Collections and transformations: 4, 6, 11, 13, 14
3. Functions and composition: 5, 8, 15
4. State-free problem solving: 7, 9, 10, 12
5. Extra challenge: 16, 17, 18, 19, 20

---

## Concept Index

| Concept | Exercises |
|---|---|
| `def` / `defn` / bindings | 1, 3, 5 |
| Flow control (`if`, `cond`, `when`) | 2, 12, 20 |
| `let` | 3, 7 |
| Destructuring | 7, 17 |
| Anonymous functions | 6, 11 |
| Higher-order functions (`map`, `filter`, `reduce`) | 4, 11, 13, 15, 18 |
| Closures / returning functions | 5 |
| Arity & variadic | 8, 16 |
| `loop` / `recur` | 9, 17, 20 |
| Strings & regex | 8, 10 |
| Threading macros (`->>`, `->`) | 6, 11, 19 |
| Immutable data structures | 14, 17 |
| Vectors & maps | 4, 7, 13, 14, 19 |
| Keywords as functions | 13, 19 |
| Predicates (`some`, `every?`) | 15, 18 |

---

## Exercise 1 — Temperature Converter
**Tags:** `def` `defn` `arithmetic` `bindings`

Write functions to convert temperatures between Celsius, Fahrenheit, and Kelvin.

```
(celsius->fahrenheit 0)   ;=> 32.0
(fahrenheit->celsius 212) ;=> 100.0
(celsius->kelvin 0)       ;=> 273.15
```

---

## Exercise 2 — FizzBuzz with `cond`
**Tags:** `cond` `flow-control` `arithmetic`

Write a function `fizzbuzz` that takes a number and returns:
- `"FizzBuzz"` if divisible by both 3 and 5
- `"Fizz"` if divisible by 3
- `"Buzz"` if divisible by 5
- The number as a string otherwise

```
(fizzbuzz 15) ;=> "FizzBuzz"
(fizzbuzz 9)  ;=> "Fizz"
(fizzbuzz 7)  ;=> "7"
```

---

## Exercise 3 — Shopping Cart Total
**Tags:** `let` `arithmetic` `defn`

Write a function `cart-total` that takes a base price, a discount percentage (0–100), and a tax rate (0–100).  
Use `let` to name each intermediate step (discount amount, discounted price, tax amount).

```
(cart-total 100 10 5) ;=> 94.5
```

---

## Exercise 4 — Vector Statistics
**Tags:** `vectors` `map` `filter` `reduce` `higher-order-functions`

Given a vector of numbers, write three functions:
- `my-sum` — returns the sum of all numbers
- `my-average` — returns the average
- `above-average` — returns a vector of numbers that are strictly above the average

```
(my-sum [1 2 3 4 5])       ;=> 15
(my-average [1 2 3 4 5])   ;=> 3.0
(above-average [1 2 3 4 5]);=> [4 5]
```

---

## Exercise 5 — Greeting Factory (Closure)
**Tags:** `closures` `returning-functions` `higher-order-functions`

Write a function `make-greeter` that takes a greeting word and returns a new function.  
The returned function takes a name and produces a greeting string.

```
(def hello (make-greeter "Hello"))
(def hola  (make-greeter "Hola"))

(hello "Alice") ;=> "Hello, Alice!"
(hola "Bob")    ;=> "Hola, Bob!"
```

---

## Exercise 6 — Anonymous Function Workout
**Tags:** `anonymous-fn` `map` `filter` `#()` `fn`

Without using `defn`, solve each of the following using `fn` or `#()`:

1. Double every number in `[1 2 3 4 5]` using `map`
2. Keep only strings longer than 3 characters from `["hi" "hello" "hey" "world"]`
3. Build a pipeline with `->>` that squares every odd number in `[1 2 3 4 5 6]`

---

## Exercise 7 — Destructuring a Player Record
**Tags:** `destructuring` `maps` `vectors`

Given a map representing a game player:

```clojure
{:name "Aria" :scores [10 25 30 15] :level 5}
```

Write a function `player-summary` that:
- Destructures the map using `{:keys [...]}`
- Returns a string like: `"Aria (level 5) — best score: 30"`

---

## Exercise 8 — Variadic Logger
**Tags:** `arity` `variadic` `clojure.string`

Write a function `log` with two arities:
- `(log level message)` — formats as `"[LEVEL]: message"`
- `(log level message & tags)` — appends tags in brackets: `"[LEVEL]: message [tag1, tag2]"`

```
(log "INFO" "Server started")             ;=> "[INFO]: Server started"
(log "WARN" "Low memory" "db" "cache")    ;=> "[WARN]: Low memory [db, cache]"
```

---

## Exercise 9 — Recursive Countdown
**Tags:** `loop` `recur` `recursion`

Use `loop`/`recur` to write a function `countdown` that returns a vector counting down from `n` to `0`.

```
(countdown 5) ;=> [5 4 3 2 1 0]
```

Then rewrite it using `reduce` over a range — compare both approaches.

---

## Exercise 10 — String Log Parser
**Tags:** `clojure.string` `regex` `strings`

Write a function `parse-log` that takes a raw log string like `"[ERROR]: File not found"` and returns a map:

```clojure
{:level "error" :message "File not found"}
```

Use `re-find`, `clojure.string/lower-case`, and `clojure.string/trim`.

---

## Exercise 11 — Map Transformer with `->>` 
**Tags:** `threading-macros` `maps` `higher-order-functions`

Given a list of product maps:

```clojure
[{:name "apple" :price 1.5 :qty 10}
 {:name "banana" :price 0.5 :qty 0}
 {:name "cherry" :price 3.0 :qty 5}]
```

Using `->>`, write `in-stock-revenue` that:
1. Filters out items where `:qty` is 0
2. Maps each to `(* :price :qty)`
3. Sums the results

```
(in-stock-revenue products) ;=> 30.0
```

---

## Exercise 12 — Boolean Logic Gate
**Tags:** `boolean` `and` `or` `not` `flow-control`

Model a simple access-control system. A user can enter a room if:
- They have a `valid-badge?` **and** (`is-staff?` **or** `has-escort?`)
- **Or** they have `override-code?`

Write `can-enter?` taking those four booleans and return `true`/`false`.

---

## Exercise 13 — Keyword as Function
**Tags:** `maps` `keywords` `higher-order-functions`

Given a list of maps, use keywords directly as functions (no anonymous fn wrapper) to:
1. Extract all `:name` values from a list of people maps
2. Sort people maps by `:age` using `sort-by`

```clojure
(map :name [{:name "Ana" :age 30} {:name "Bruno" :age 25}])
;=> ("Ana" "Bruno")
```

---

## Exercise 14 — Immutable Update Chain
**Tags:** `vectors` `assoc` `immutability` `maps`

Start with this inventory vector:

```clojure
[{:item "sword" :qty 3} {:item "shield" :qty 1} {:item "potion" :qty 10}]
```

Without mutating anything, write a function `restock` that returns a **new** vector where every item's `:qty` is doubled.  
Then write `sell` that decrements the `:qty` of the item at a given index by 1, returning a new vector.

---

## Exercise 15 — `some` and `every?` Predicates
**Tags:** `sequences` `predicates` `higher-order-functions`

Write these functions using `some` and `every?`:
- `all-positive?` — true if every number in a vector is positive
- `has-nil?` — true if any element in a collection is `nil`
- `first-even` — returns the first even number in a sequence (or `nil`)

---

## Exercise 16 — Multi-arity Discount Calculator
**Tags:** `arity` `default-arguments` `defn`

Write `apply-discount` with three arities:
- `(apply-discount price)` — applies a default 10% discount
- `(apply-discount price rate)` — applies the given rate (0.0–1.0)
- `(apply-discount price rate max-discount)` — applies the rate but caps the discount amount at `max-discount`

```
(apply-discount 100)        ;=> 90.0
(apply-discount 100 0.20)   ;=> 80.0
(apply-discount 100 0.50 30);=> 70.0
```

---

## Exercise 17 — Symmetrize a Body
**Tags:** `loop` `recur` `destructuring` `sets` `sequences`

Revisit `symmetrize-body-parts` from `matching_part.clj`. Rewrite it **without** `loop`/`recur`, using only `reduce` and `into`. Verify that both versions produce the same result on the same input.

---

## Exercise 18 — Bird Watcher Extended
**Tags:** `sequences` `filter` `reduce` `map` `higher-order-functions`

Extend the `bird_watcher.clj` logic with:
- `best-streak` — returns the length of the longest consecutive run of days with birds > 0
- `weekly-report` — returns a map `{:total N :busy-days N :zero-days N}` summarizing the week

```
(weekly-report [0 2 5 3 7 8 4])
;=> {:total 29 :busy-days 3 :zero-days 1}
```

---

## Exercise 19 — Production Rate Pipeline
**Tags:** `threading-macros` `maps` `data-tables` `higher-order-functions`

Using the `cars_assemble_optimized.clj` approach (data table + `->>` pipeline), build a `speed-report` function that takes a vector of speeds and returns a sorted vector of maps:

```clojure
[{:speed 3 :rate 1.0 :items-per-hour 663}
 {:speed 7 :rate 0.9 :items-per-hour 1390}
 ...]
```

---

## Exercise 20 — Mini State Machine with `cond`
**Tags:** `cond` `maps` `flow-control` `defn` `immutability`

Model a traffic light as a map `{:state :green :elapsed 0}`.  
Write a pure function `tick` that takes the current state map and returns the **next** state map following the cycle: `:green` → `:yellow` → `:red` → `:green`.

Then write `simulate` using `loop`/`recur` that runs the light for `n` ticks and returns the sequence of states.

```
(simulate 4)
;=> ({:state :green} {:state :yellow} {:state :red} {:state :green})
```
