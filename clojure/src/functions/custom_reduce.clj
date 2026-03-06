(ns functions.custom-reduce)

(defn custom-reduce
  ([fn initial coll]
   (loop [result initial
          remaining coll]n 
     (if (empty? remaining)
       result
       (recur (fn result (first remaining)) (rest remaining)))))
  ([fn [head & tail]]
   (custom-reduce fn head tail)))

