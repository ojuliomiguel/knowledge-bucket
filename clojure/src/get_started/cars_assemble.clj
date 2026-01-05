(ns get-started.cars-assemble)

(defn production-rate
  [speed]
  (cond
    (== speed 0)                    0.0
    (and (>= speed 1) (<= speed 4)) (double (* speed 221))
    (and (>= speed 5) (<= speed 8)) (* speed 221 0.9)
    (and (>= speed 9) (<= speed 10)) (* speed 221 0.77)))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed])
