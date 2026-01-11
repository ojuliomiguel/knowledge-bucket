(ns get-started.vectors)

(def empty [])
(def single-value [7])
(def single-value-in-another-way (vector 7))
(def three-heterogenouys-types [1 "a" "b"])

; Retriving values:

(get three-heterogenouys-types 2) ; => b


; this dont change de original array values
(assoc three-heterogenouys-types 0 "x") ; => ["x" "a" "b"]

; to get the new array:

(def updated-three-arrr-types
  (assoc three-heterogenouys-types 0 "x")) ; => ["x" "a" "b"]

(get updated-three-arrr-types 0)
