(ns functions.matching-part
  (:require [clojure.string :as str]))


(defn matching-part
  [part]
  {:name (str/replace (:name part) #"ˆleft-" "right-")
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

(re-find #"^left-" "left-eye")
(re-find #"^left" "cleft-chin")
(re-find #"ˆleft" "water melon")

(matching-part {:name "left-eye" :size 1})