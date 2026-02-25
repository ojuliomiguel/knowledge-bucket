(ns exercises.temperature-converter)

(def fahrenheit_constant 32)
(def kelvin_constant 273.15)

(defn celsius_to_fahrenheit
  [temperature]
  (let [fahrenheit_multiply 1.8]
    (float (+ (* temperature fahrenheit_multiply) fahrenheit_constant))))

println (celsius_to_fahrenheit 0)

(defn fahrenheit_to_celsius
  [temperature]
  (float (* (- temperature fahrenheit_constant) 5/9)))

(println (fahrenheit_to_celsius 212))

(defn kelvin_to_celsius
  [temperature]
  (+ temperature kelvin_constant))

(println (kelvin_to_celsius 0))