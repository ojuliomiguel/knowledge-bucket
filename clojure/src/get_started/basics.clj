(defn say [x]
  (println x)
  (flush))

; Top-level vars 

(def lula-fingers 9)

; defn can be used to define a function takig zero or more args.

(defn add [x y] 
  (+ x y)) ; the last expression in its bodys is the returns

; invoking:
(def ten (add 5 5))

(say (add 5 5)) ; the flush uses is because calva behavior