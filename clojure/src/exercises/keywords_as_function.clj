(ns exercises.keywords-as-function)

; (fn [p] (get p :name))

(def peoples [{:name "Ana" :age 32} {:name "Julia" :age 22}])

(map :name peoples)

(sort-by :age peoples)