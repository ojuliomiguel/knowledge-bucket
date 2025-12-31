(ns get-started.flow-control)

(if (even? 2) "even" "odd")

; cond is a series of tests and expressions to evaluate

(def x (rand-int 10))

(cond (= x 5) "When x equals 5"
      (> x 7) "When x is greater than 7"
      :else "None of cases")