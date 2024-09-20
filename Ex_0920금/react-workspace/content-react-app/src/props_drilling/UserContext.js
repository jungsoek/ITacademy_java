import React, {createContext, useState} from 'react'

// 새로운 Context 생성하기
// createContext() : 하워 컴포넌트로 데이터를 전달하는 함수
// UserContext : createContext() 함수를 실행하고 반환된 객체를 담는 변수
// 이 객체는 제공(provider)하거나, 소비(consumer)할 수 있는 기능을 제공
export const UserContext = createContext();

export const UserProvider = ({children}) => {
    const [user, SetUser] = useState({name : 'asdf', age : 30});

    // UserContext에 들어있는 내용
    // user : {name : 'asdf', age : 30}
    // SetUser() 함수

    return (
        <UserContext.Provider value = {{user, SetUser}}>
            {children} {/* UserProvider컴포넌트가 감싸고 있는 모든 하위 컴포넌트 */}
        </UserContext.Provider>
    )
}
