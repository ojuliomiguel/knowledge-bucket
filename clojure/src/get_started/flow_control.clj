(ns get-started.flow-control)

(if (even? 2) "even" "odd")

; cond is a series of tests and expressions to evaluate

(def x (rand-int 10))

(cond (= x 5) "When x equals 5"
      (> x 7) "When x is greater than 7"
      :else "None of cases")

(if (Object.) :truthy :falsey) ; objects are true
(if 0 :truthy :falsey) ; zero is true

; if and do

(if (even? 5)
  (do (println "even")
      true)
  (do (println "odd")
      false))