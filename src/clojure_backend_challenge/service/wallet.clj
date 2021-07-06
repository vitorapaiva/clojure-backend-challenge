(ns clojure-backend-challenge.service.wallet
  (:require [clojure-backend-challenge.database]
            [clojure-backend-challenge.repository.wallet :as wallet-repo]
            [korma.core :refer :all]))

(defn add-wallet [user_id value]
  (wallet-repo/add-wallet user_id value))

(defn update-wallet [user_id value]
  (wallet-repo/update-wallet user_id value))

(defn get-wallet [user_id]
  (wallet-repo/get-wallet user_id))