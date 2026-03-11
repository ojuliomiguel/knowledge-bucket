(ns functions.add-100)

(defn add-100 
  [number]
  (let [one_hundred 100]
    (+ number one_hundred)))

(add-100 1)