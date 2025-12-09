(defn age-classify [age]
    (cond
        (< age 12) "child"
        (< age 18) "teen"
        (< age 60) "adult"
        :else "old"))

(println (age-classify 17))
(println (age-classify 18))