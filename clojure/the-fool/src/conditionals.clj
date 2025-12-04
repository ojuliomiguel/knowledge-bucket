(defn age_classify [age]
    (cond
        (< age 12) "child"
        (< age 18) "teen"
        (< age 60) "adult"
        : else "old"))