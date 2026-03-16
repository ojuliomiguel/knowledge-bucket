(ns exercism.raindrops
  (:require [clojure.string :as str]))

(defn isDivisible?
  [num, divsor]
  (= (mod num divsor) 0))

(defn convert
  [num]
  (clojure.string/join (filter some? [(when (isDivisible? num 3) "Pling")
                                      (when (isDivisible? num 5) "Plang")
                                      (when (isDivisible? num 7) "Plong")])))

(convert 30)