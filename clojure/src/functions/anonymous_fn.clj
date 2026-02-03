(ns functions.anonymous-fn)

; It's very similar to defn

((fn [x] (* x 3)) 3)

(map (fn [name] (str "Hi, " name)) 
     ["Alfredo" "Ronaldo"])

; We can bind a anonymous function to a name

(def special-multiplier (fn [x] (* x 2)))

(special-multiplier 2)

; special way to declare

(#(* 3 %) 3)

(map #(str "Hi " %) ["Mario" "Luigi"])

(#(str %1 " and " %2) "Coconut" "Massagem")

;Using rest parameter

(#(identity %&) 1 "Blong" :up)