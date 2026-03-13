(ns brave-clojure.vectors)

(def empty [])
(def single-value [7])
(def single-value-in-another-way (vector 7))
(def three-heterogeneous-types [1 "a" "b"])

; Retrieving values:

(get three-heterogeneous-types 2) ; => b


; This does not change the original vector.
(assoc three-heterogeneous-types 0 "x") ; => ["x" "a" "b"]

; To keep the new vector:

(def updated-three-arr-types
  (assoc three-heterogeneous-types 0 "x")) ; => ["x" "a" "b"]

(get updated-three-arr-types 0)
