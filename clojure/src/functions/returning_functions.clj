(ns functions.returning-functions)

(defn inc-maker 
  [inc-by]
  #(+ % inc-by))

(def inc3 (inc-maker 3))

(inc3 7)
