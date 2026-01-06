(ns get-started.cars-assemble)

(def base-production-rate 221)

(defn success-rate [speed]
  (cond
    (== speed 0) 0.0
    (<= speed 4) 1.
    (<= speed 8) 0.9
    (== speed 9) 0.8
    (== speed 10) 0.77))

(defn production-rate [speed]
  (double (* speed base-production-rate (success-rate speed))))

(defn working-items [speed]
  (int (/ (production-rate speed) 60)))
