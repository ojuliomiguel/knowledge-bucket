(ns functions.better-symetrize-body-parts
  (:require [functions.matching-part :refer [matching-part]]))

(defn better-symetrize-body-parts
  [asym-body-parts]
  (reduce (fn [final-body-parts part]
            (into final-body-parts (set [part (matching-part part)])))
          []
          asym-body-parts))