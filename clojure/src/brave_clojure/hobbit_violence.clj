(ns brave-clojure.hobbit-violence
  (:require
   [brave-clojure.asym-hobbit-body-parts :refer [asym-hobbit-body-parts]]
   [brave-clojure.better-symmetrize-body-parts :refer [better-symmetrize-body-parts]]))

(defn hit
  [asym-body-parts]
  (let [sym-parts (better-symmetrize-body-parts asym-body-parts)
        body-part-size-sum (reduce + (map :size sym-parts))
        target (rand body-part-size-sum)]
    (loop [[part & remaining] sym-parts
           accumulated-size (:size part)]
      (if (> accumulated-size target)
        part
        (recur remaining (+ accumulated-size (:size (first remaining))))))))

(hit asym-hobbit-body-parts)
