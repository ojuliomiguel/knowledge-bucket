(ns get-started.let-be)

(defn calculate-total-order
  [base-price]
  (let [disccount-rate 0.10
        tax-rate 0.05
        discount-amt (* base-price disccount-rate)
        discounted (- base-price discount-amt)
        tax-amt (* discounted tax-rate)
        total (+ discounted tax-amt)]
    (str "Final Price: $ " total " (Discount: $" discount-amt ")")))

; Let introduces a new scope

(def x 0)
;; (let [x 1] x)
(let [x (inc x)] x)

; Using Rest parameters in let

(def dalmatians-list ["Pongo" "Perdita" "Puppy 1"  "Puppy 2"])

(let [[pongo & dalmatians] dalmatians-list]
  [pongo dalmatians])
                                           
