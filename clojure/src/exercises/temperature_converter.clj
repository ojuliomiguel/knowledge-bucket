(ns exercises.temperature-converter)


(defn celsius_to_fahrenheit
  [temperature]
  (let [fahreneit_multiply 1.8]
    (float (+ (* temperature fahreneit_multiply) 32))))

println (celsius_to_fahrenheit 1)