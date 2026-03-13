(ns brave-clojure.let-be)

(defn calculate-total-order
  [base-price]
  (let [discount-rate 0.10
        tax-rate 0.05
        discount-amt (* base-price discount-rate)
        discounted (- base-price discount-amt)
        tax-amt (* discounted tax-rate)
        total (+ discounted tax-amt)]
    (str "Final Price: $ " total " (Discount: $" discount-amt ")")))

; Let introduces a new scope

(def x 0)
;; (let [x 1] x)
(let [x (inc x)] x)

; Using rest parameters in let

(def dalmatians-list ["Pongo" "Perdita" "Puppy 1"  "Puppy 2"])

(let [[pongo & dalmatians] dalmatians-list]
  [pongo dalmatians])
                                           
