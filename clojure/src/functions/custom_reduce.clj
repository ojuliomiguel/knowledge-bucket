(ns functions.custom-reduce)

(defn custom-reduce
  ([func initial coll]
   (loop [result initial
          remaining coll]
     (if (empty? remaining)
       result
       (recur (func result (first remaining)) (rest remaining)))))
  ([func [head & tail]]
   (custom-reduce func head tail)))