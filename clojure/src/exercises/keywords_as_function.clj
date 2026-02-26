(ns exercises.keywords-as-function)

; We can use keyword as a function like: (fn [p] (get p :name))

(def peoples [{:name "Ana :age 27"} {:name "Júlia" :age 22}])

(map :name peoples)

(sort-by :age peoples)