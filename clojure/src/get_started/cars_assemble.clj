(ns get-started.cars-assemble)

(defn production-rate
  [speed]
  (cond (== speed 0) 0)
  (cond (or (>= speed 1) (<= speed 4)) 221 * speed))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed])
