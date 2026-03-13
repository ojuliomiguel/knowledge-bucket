(ns katas.keywords-as-function)

; We can use keyword as a function like: (fn [p] (get p :name))

(def people [{:name "Ana" :age 27}
             {:name "Julia" :age 22}])

(map :name people)

(sort-by :age people)
