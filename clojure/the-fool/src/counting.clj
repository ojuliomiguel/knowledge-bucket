(ns counting)

(defn count-numbers [numbers]
    (count numbers))

(defn count-evens [numbers]
    (count (filter even? numbers)))

(println (count-evens [1,2,3,4,5,6,7,8,9,10]))