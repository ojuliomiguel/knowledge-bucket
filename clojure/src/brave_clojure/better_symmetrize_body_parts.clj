(ns brave-clojure.better-symmetrize-body-parts
  (:require [brave-clojure.matching-part :refer [matching-part]]))

(defn better-symmetrize-body-parts
  [asym-body-parts]
  (reduce (fn [final-body-parts part]
            (into final-body-parts (set [part (matching-part part)])))
          []
          asym-body-parts))
