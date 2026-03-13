(ns exercism.raindrops
  (:require [clojure.string :as str]))

(defn convert
  [num]
  (clojure.string/join (filter some? [(when (= (mod num 3) 0) "Pling")
                                      (when (= (mod num 5) 0) "Plang")
                                      (when (= (mod num 7) 0) "Plong")])))

(convert 28)