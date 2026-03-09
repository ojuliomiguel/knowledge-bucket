(ns functions.hobbit-violence
  (:require [functions.better-symetrize-body-parts :refer [better-symetrize-body-parts]]))

(defn hit
  [asym-body-parts]
  (let [sym-parts (better-symemetrize-body-parts asym-body-parts)
        body-part-size-sum (reduce + (map :size sym-parts))
        target (rand body-part-size-sum)]
    (loop [[part & remaining] sym-parts
           accumulated-size (:size part)]
      (if (> accumulated-size target)
        part
        (recur remaining (+ accumulated-size (:size (first remaining))))))))