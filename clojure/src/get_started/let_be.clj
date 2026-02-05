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