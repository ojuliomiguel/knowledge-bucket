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


(defn x-console
  [name console-type]
  (str "Selected console " name console-type)
  [name]
  (x-console name "Playstation"))

(defn weird-arity
  ([] 
   "Let the body hit the floor")
  ([number]
   (inc number)))

(weird-arity)
(weird-arity 1)
