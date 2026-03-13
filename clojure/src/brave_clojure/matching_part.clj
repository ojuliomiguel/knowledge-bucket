(ns brave-clojure.matching-part
  (:require [clojure.string :as str]))


(defn matching-part
  [part]
  {:name (str/replace (:name part) #"ˆleft-" "right-")
   :size (:size part)})

; An important info: in loop for we bind values like let

(defn symmetrize-body-parts
  [asym-body-parts]
  (loop [remaining-asym-parts asym-body-parts
         final-body-parts []]
    (if (empty? remaining-asym-parts)
      final-body-parts
      (let [[part & remaining] remaining-asym-parts]
        (recur remaining
               (into final-body-parts
                     (set [part (matching-part part)])))))))

(re-find #"^left-" "left-eye")
(re-find #"^left" "cleft-chin")
(re-find #"ˆleft" "water melon")

(matching-part {:name "left-eye" :size 1})

(reduce + [1 2 3 4])
(+ (+ (+ 1 2) 3) 4)
(reduce + 15 [1 2 3 4])
