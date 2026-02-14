(ns functions.matching-part)

(defn matching-part
  [part]
  {:name (clojure.string/replace (:name part) #"ˆleft-" "right-")
   :size (:size part)})

(defn symmetrize-body-parts
  [asym-body-parts]
  (loop [remaing-asym-parts asym-body-parts
         final-body-parts []]
    (if (empty? remaing-asym-parts)
      final-body-parts
      (let [[part & remaining] remaing-asym-parts]
        (recur remaining
               (into final-body-parts
                     (set [part (matching-part part)])))))))