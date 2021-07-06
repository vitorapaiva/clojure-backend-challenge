(ns clojure-backend-challenge.service.transaction
  (:require [clojure-backend-challenge.database]
            [clojure-backend-challenge.repository.transaction :as transaction-repo]
            [korma.core :refer :all]))

(defn get-transactions []
  (transaction-repo/get-transactions))

(defn add-transaction [payer_id payee_id value]
  (transaction-repo/add-transaction payer_id payee_id value))

(defn get-transaction [transaction_uuid]
  (transaction-repo/get-transaction transaction_uuid))