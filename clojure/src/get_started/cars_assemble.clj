(ns get-started.cars-assemble)

(defn production-rate [speed]
  (cond
    (== speed 0)                    0.0
    (and (>= speed 1) (<= speed 4)) (double (* speed 221))
    (and (>= speed 5) (<= speed 8)) (* speed 221 0.9)
    (== speed 9) (* speed 221 0.8)
    (== speed 10) (* speed 221 0.77)))

(defn working-items [speed]
  (cond
    (== speed 0) 0
    (and (>= speed 1) (<= speed 4)) (int (/ (* speed 221) 60))
    (and (>= speed 5) (<= speed 8)) (int (/ (* speed 221 0.9) 60))
    (== speed 9) (int (/ (* speed 221 0.8) 60))
    (== speed 10) (int (/ (* speed 221 0.77) 60))))
