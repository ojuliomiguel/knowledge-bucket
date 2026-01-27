(ns get-started.parameters-arity
  (:require [clojure.string :as str]))

(defn put-all-together
  ([arg] arg)
  ([numberOne numberTwo]
   (+ numberOne numberTwo))
  ([thingsOne thingsTwo & othersThings]
   (str/join ", " (concat [thingsOne thingsTwo] othersThings))))

(put-all-together 1 2)
(put-all-together "One" "Two" "Three")

