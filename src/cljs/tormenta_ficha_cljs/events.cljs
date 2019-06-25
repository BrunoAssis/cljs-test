(ns tormenta-ficha-cljs.events
  (:require
   [re-frame.core :as rf]
   [tormenta-ficha-cljs.db :as db]
   ))

(rf/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))

(rf/reg-event-db
  ::character-name-change
  (fn [db [_ new-value]]
    (js/console.log new-value)
    (assoc db :character-name new-value)))
