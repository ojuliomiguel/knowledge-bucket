(ns katas.temperature-converter)

(def ^:const fahrenheit-constant 32)
(def ^:const kelvin-constant 273.15)
(def ^:const fahrenheit-multiply 1.8)
(def ^:const fahrenheit-divisor 5/9)

(defn celsius_to_fahrenheit
  [temperature]
  (float (+ (* temperature fahrenheit-multiply) fahrenheit-constant)))

(println (celsius_to_fahrenheit 0))

(defn fahrenheit_to_celsius
  [temperature]
  (float (* (- temperature fahrenheit-constant) fahrenheit-divisor)))

(println (fahrenheit_to_celsius 212))

(defn kelvin_to_celsius
  [temperature]
  (+ temperature kelvin-constant))

(println (kelvin_to_celsius 0))
