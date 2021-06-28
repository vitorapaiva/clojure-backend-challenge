(ns clojure-backend-challenge.query-transaction
  (:require [clojure-backend-challenge.database]
            [korma.core :refer :all]))

(defentity transaction)

(defn get-transactions []
  (select transaction))

(defn add-transaction [payer_id payee_id value]
  (insert transaction
          (values {:payer_id payer_id :payee_id payee_id :value value})))

(defn get-transaction [transaction_uuid]
  (first
    (select transaction
            (where {:transaction_uuid [= transaction_uuid]}))))